class pascalTriangleCaseStudy {
	public static void main(String[]args){
		int r=12;
		int a[][]=new int[r+1][]; //表示n个一维数组组成
		for(int i=0;i<=r;i++){
			a[i]=new int[i+1];
		} //表示使用for循环为一维数组指定列数
		YangHui(a,r);
	}
	static void YangHui(int a[][],int r){
		for(int i=0;i<=r;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==0||j==0||j==a[i].length-1) {
					a[i][j]=1;
				} else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		for(int i=0;i<=r;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}