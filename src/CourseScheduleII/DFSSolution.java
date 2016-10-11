package CourseScheduleII;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import NumberOfIslands.DFS;

public class DFSSolution {
	boolean impossible = false; // I like this way of storing the possibility of impossiblity :P

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		Stack<Integer> stack = new Stack<>();
		List<List<Integer>> graph = new ArrayList<>();
		int[] path = new int[numCourses];
		for (int i = 0; i < numCourses; i++) // building the base.
			graph.add(new ArrayList<>());
		for (int i = 0; i < prerequisites.length; i++) { // Building graph.
			graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
		}
		for (int i = 0; i < numCourses; i++) { // Actual DFS calls.
			dfs(stack, graph, path, i);
			if (impossible)
				return new int[0];
		}
		int[] res = new int[numCourses];
		for (int i = numCourses - 1; i >= 0; i--) // Build result.
			res[i] = stack.pop();
		return res;

	}

	private void dfs(Stack<Integer> stack, List<List<Integer>> graph, int[] path, int course) {
		if (path[course] == 2 || impossible) {
			return;
		}
		if (path[course] == 1) { // cycle exists.
			impossible = true;
			return;
		}
		path[course] = 1; // '1' means being explored.
		for (int nextCourse : graph.get(course)) {
			dfs(stack, graph, path, nextCourse);
			if (impossible)
				return;
		}
		stack.push(course); // done exploring.
		path[course] = 2; // '2' means Exploration complete.

	}
	
}