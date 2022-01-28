// class SpecificArrayInt{
// 	int a[];

// 	SpecificArrayInt(int a[]){
// 		this.a = a;
// 	}
// 	void printInt(){
// 		for(int x:this.a){
// 			System.out.println(x);
// 		}
// 	}

// 	void reverseInt(){
// 		int i = 0;
// 		int j = this.a.length() - 1;
// 		while(i < j){
// 			swap(this.a,i,j);
// 			i++;
// 			j--;
// 		}

// 	}
// }

// generic class
class GenericClass <T>{
	private T x;
	public GenericClass(T t){
		x = t;
	}

	public void printData(){
		System.out.println(x);
	}
}

public class GenericClassBasics{
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("Java");
		s.printData();
		GenericClass<Integer> i = new GenericClass<Integer>(10);
		i.printData();
		GenericClass<Double> d = new GenericClass<Double>(3.14);
		d.printData();

	}
}

/// defining a generic class with array of any data type

class GenericArray <T>
{
	T a[];
	GenericArray(T x[]){
		a = x;
	}
	T getData(int i){
		return a[i];
	}

	void  printData(T b){
		for(int i = 0 ; i < b.length() ; i++){
			System.out.println(b.getData(i) + " ");

		}
	}



}

// dfining the userdefined data type



