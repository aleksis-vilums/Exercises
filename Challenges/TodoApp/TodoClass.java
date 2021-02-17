public class TodoClass {

    String description, due;
    Boolean done;
    int priorty;

	TodoClass(String description, String due, int priorty, Boolean done){
        this.description = description;
        this.due = due;
        this.priorty = priorty;
        this.done = done;
	}
	
	public void addlist(String description, String due, int priorty, Boolean done){
        this.description = description;
        this.due = due;
        this.priorty = priorty;
        this.done = done;
	}
    
	public String toString(){
		String tasks = new String("Task: " + description + "\nDue: " + due + "\nPriorty: " + priorty + "\nDone? " + done + "\n");
		
		return tasks;
	}

}