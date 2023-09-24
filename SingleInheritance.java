package Krishna;

class Animals { 
		
		void eat(){
			System.out.println("eating.");
			}  
		 }
		class Tiger extends Animals{                         //single level inhetence Animal-->Dog-->cat
			
		  void roar()
		  {
		System.out.println("roaring");
		}

		}
		public class SingleInheritance{
			public static void main(String[] args) {
				Tiger tg=new Tiger();
				tg.eat();
				tg.roar();
			}
			
		}



