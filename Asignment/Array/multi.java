//iteration of multidirectional array
class text{
	public static void main(String[] args){
		int[][] a={{10,22,33,44},{22,44,55,66}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
		}
	}
}