public class conditional_statements {
    int num;
    conditional_statements(){
        this.num = 0;
    }
    conditional_statements(int n){
        this.num = n;
    }
    public void check(){
        if(this.num > 6){
            System.out.println("positive:" +this.num);
        }
        else if(this.num > 0){
            System.out.println("positive(1-6):"+this.num);
        }
        else if(this.num==0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative:"+this.num);
        }
    }
    public static void main(String[] args) {
        conditional_statements obj1 = new conditional_statements(5);
        conditional_statements obj2 = new conditional_statements(-5);
        conditional_statements obj3 = new conditional_statements(111);
        conditional_statements obj4 = new conditional_statements();
        obj1.check();
        obj2.check();
        obj3.check();
        obj4.check();
    }
    
}
