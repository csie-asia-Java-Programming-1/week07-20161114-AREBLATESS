package ex;
/*
 * Date: 2016/11/14
 * Author: 105021008 ��ڭ�{
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		float data[]=new float[n];
		double sigama=0;
		double sum=0;
		for(int i1=0;i1<n;i1++){
			data[i1]=scn.nextInt();
		}
		for(int i3=0;i3<n;i3++){
			sigama=data[i3]-(var(n,data));
			sum=sum+Math.pow(sigama, 2);
		}			
		sum=sum/n;
		System.out.println(sum);
			}
	public static float var(int n,float data[]){
		float sum=0;
		float miu=0;
		for(int i2=0;i2<n;i2++){
			sum=sum+data[i2];
		}
		miu=sum/n;
		return miu;

	}
}