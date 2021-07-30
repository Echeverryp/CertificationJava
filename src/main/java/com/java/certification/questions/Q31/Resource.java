package com.java.certification.questions.Q31;

public class Resource {

    private boolean ready=false;

    public void proccessWork(Worker worker){

        while (!worker.isFinished()){
            System.out.println("waiting for worker");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
            setReady(true);
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isReady(){
        return this.ready;
    }


    static class Worker{
        private boolean finished=false;

        public boolean isFinished() {
            return finished;
        }

        public void setFinished(boolean finished) {
            this.finished = finished;
        }

        public void consumeResource(Resource resource){
            while(resource.isReady()){
                System.out.println("waiting for resource");
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e){

                }
            }
            setFinished(true);

        }
    }

    public static void main(String[] args) {
        Resource resource=new Resource();
        Worker worker=new Worker();
        Thread t1=new Thread(()->resource.proccessWork(worker));
        Thread t2=new Thread(()->worker.consumeResource(resource));
        t1.start();
        t2.start();
    }
}
