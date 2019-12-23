package interviewbit.problems.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * You are in an infinite 2D grid where you can move in any of the 8 directions
 * :
 * 
 *  (x,y) to 
 *    (x+1, y), 
 *    (x - 1, y), 
 *    (x, y+1), 
 *    (x, y-1), 
 *    (x-1, y-1), 
 *    (x+1,y+1),
 *    (x-1,y+1),
 *    (x+1,y-1) 
 * 
 * You are given a sequence of points and the order in
 * which you need to cover the points. Give the minimum number of steps in which
 * you can achieve it. You start from the first point.
 * 
 * Input :
 * 
 * Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y
 * coordinate of ith point respectively. Output :
 * 
 * Return an Integer, i.e minimum number of steps. Example :
 * 
 * Input : [(0, 0), (1, 1), (1, 2)] 
 * Output : 2 
 * It takes 1 step to move from (0, 0) to (1, 1). 
 * It takes one more step to move from (1, 1) to (1, 2).
 * 
 * @author Vivek
 *
 */
public class MinStepsInInfiniteGrid
{
	public int coverPoints(List<Integer> A, List<Integer> B) {
		
		Integer[] aArray = A.toArray(new Integer[A.size()]);
		Integer[] bArray = B.toArray(new Integer[B.size()]);
		
		int stepCount = 0;
		
		for(int i =0 ; i < aArray.length - 1 ; i++)
		{
			int difa = Math.abs(aArray[i] - aArray[i+1]);
			int difb = Math.abs(bArray[i] - bArray[i+1]);
			
			stepCount += Math.max(difa, difb);
			
		}
		
		return stepCount;
		
    }
	
	public static void main(String[] args)
	{
		List<Integer> asList = Arrays.asList(1, 2, 6);
		List<Integer> bsList = Arrays.asList(1, 2, 6);
		
		MinStepsInInfiniteGrid minStepsInInfiniteGrid = new MinStepsInInfiniteGrid();
		
		System.out.println(minStepsInInfiniteGrid.coverPoints(asList, bsList));
		
	}

}