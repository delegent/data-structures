// generic methods declaration
// class GenericMethods{
// 	void genericPrint(T t){
// 		System.out.println(t);
// 	}
// 	public static void main(String[] args) {
// 		GenericMethods g;
// 		g.genericPrint("Hello");
// 		g.genericPrint(10);
// 	}

public class GenericMethods{
        //  void genericMethodForPrint(T t){
        //         System.out.println(t);
        // }
        // public static void varargs(Object ...obj){
        //     System.out.println(obj.value());
        //     for(Object o : obj){
        //         System.out.println(" " + o);
        //     }
        // } 
        public static void varargs(int ...v){ // here ...are elipsis
            System.out.println(v instanceof int[]);
            for(int valus : v){
                System.out.println(valus);
            }
        }
    public static void main(String [] args){
        // Main d; 
        // Integer i = new Integer(10);
        // d.genericMethodForPrint(i);
        // // d.genericMethodForPrint("Anubhav Raj Srivastava");
        // // d.genericMethodForPrint(3.1245);
        
        varargs(3,2,-5,68);
    }
}

