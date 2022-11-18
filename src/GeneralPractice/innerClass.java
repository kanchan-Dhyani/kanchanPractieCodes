package GeneralPractice;

public class innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // calling inner class method
		outer.inner ob = new outer().new inner();
		ob.callMe();
		
		// anonymous class
		outer obj = new outer() {
			void doPrint()
			{
				System.out.println("overridden do print");
			}
		
	};
	
	obj.doPrint();
	
	// anonymous class for interface
	outInt obj2 = new outInt() {
		
		@Override
		public void haveFun() {
			System.out.println("overridden have fun");
			
		}
	};
	obj2.haveFun();
	
  // static nested class
	outer.staticNestedClass obj3 = new outer.staticNestedClass();
	obj3.doCode();
}
}

class outer{
	int outVarInt = 10;
	 class inner{
		int outVarInt = 5;
		public void callMe()
		{
			
			System.out.println("yah");
			System.out.println(outer.this.outVarInt);
			System.out.println(this.outVarInt);
		}
	}
	
	 
	void doPrint()
	{
		// calling inner class method from inside method
		inner obj = new inner();
		obj.callMe();
		
		// calling static nested class
		staticNestedClass ab = new staticNestedClass();
		ab.doCode();
	}
	
	static class staticNestedClass{
		void doCode()
		{
			System.out.println("static Nested class method");
		}
	}
}


interface outInt{
	void haveFun();
}



