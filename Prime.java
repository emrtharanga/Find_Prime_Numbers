class Prime{
	public static void main(String[]args){
		for(int num=1;num<=100;num++){
			
			int count=0;
			for(int x=num;x>0;x--){
				if(num%x==0){
					count++;
				}
			}
			if(count==2){
			System.out.println(num);
			}
		}
	}
}