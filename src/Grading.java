//들아고마워↖(^▽^)↗사뢍해
public class Grading {

	public static void main(String[] args) {

		double sum[]=new double[]{0,0,0,0,0};
		int answer[]=new int[10];
		double jumsu[]={8.8, 9.0, 10.5, 12, 7.9, 10.8, 10, 9.8, 9, 12.2};
		
		for(int i=0; i<10; i++){
			answer[i]=Integer.parseInt(args[i]);
		}
	
		System.out.println("시작합니다.");
	
	int a[][]={
			{1,3,2,4,3,1,4,2,2,1},
			{3,2,4,2,2,1,1,3,4,1},
			{2,4,3,2,1,2,1,3,3,4},
			{2,3,3,1,1,3,2,2,4,4},
			{3,1,1,2,4,1,2,3,1,3}};
	
	for(int i = 0; i<a.length;i++){
		for(int j = 0; j<a[i].length;j++){
			if(a[i][j]==answer[j]){
				sum[i]+=jumsu[j];
				System.out.print("O\t");
			}
			else System.out.print("X\t");
		}
		System.out.print("점수: "+sum[i]);
		System.out.println("");
	}
	
	
		
	}

}