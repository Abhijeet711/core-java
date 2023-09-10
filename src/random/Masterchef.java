/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Abhi
 */

package random;

/*
Question:
You are a participant in the MasterChef contest and are in a round where you are asked to choose your own set of ingredients from a given list. Each ingredient has a point associated with it. You are allowed to choose as many ingredients as you want such that the sum of the points does not exceed N, an integer. Write al program which takes a list of ingredients and their points as input. program also takes N as an input. The program must calculate all the possible ways in which the ingredients can be selected as per the rule above.

Note: 
1. Each ingredient can be chosen only once. Any number of ingredients can be chosen together to meet the given condition. Please check all corner conditions in your program
2. Try to avoid built-in libraries as much as possible in some programming languages. The test here is to see your skill in writing the algorithm.

Sample:
Input: A=2, B-3, C=4, D=5, E=1 N=5
Output: E, A, B, C, D, (A. E). (B, E), (A, B). (C, E). (D) (All of these selections have sum of points than or equal to N=5)
 */
import java.util.ArrayList;
import java.util.List;

public class Masterchef {
    public static void main(String[] args) {
        // Define the ingredients and their points
        char[] ingredients = {'A', 'B', 'C', 'D', 'E'};
        int[] points = {2, 3, 4, 5, 1};
        int N = 5;

        List<List<Character>> selectedIngredients = new ArrayList<>();
        List<Character> currentSelection = new ArrayList<>();

        calculateCombinations(ingredients, points, N, 0, currentSelection, selectedIngredients);

        // Print the selected ingredient combinations
        for (List<Character> selection : selectedIngredients) {
            System.out.println(selection);
        }
    }

    private static void calculateCombinations(char[] ingredients, int[] points, int N, int index,
                                               List<Character> currentSelection, List<List<Character>> selectedIngredients) {
        if (N == 0) {
            // If N is zero, the combination is valid
            selectedIngredients.add(new ArrayList<>(currentSelection));
            return;
        }

        if (N < 0 || index == ingredients.length) {
            // If N becomes negative or we have processed all ingredients, backtrack
            return;
        }

        // Include the current ingredient in the selection
        currentSelection.add(ingredients[index]);
        calculateCombinations(ingredients, points, N - points[index], index + 1, currentSelection, selectedIngredients);

        // Exclude the current ingredient from the selection
        currentSelection.remove(currentSelection.size() - 1);
        calculateCombinations(ingredients, points, N, index + 1, currentSelection, selectedIngredients);
    }
}

/*
Working:
nput Ingredients and Points:

Begin by defining the list of available ingredients and their associated points. For this example, let's assume we have ingredients A, B, C, D, and E with points 2, 3, 4, 5, and 1, respectively.
Input Maximum Points (N):

Take the input of the maximum point limit, denoted as N. In your sample input, N is 5.
Initialize Data Structures:

Create data structures to keep track of the selected ingredients and the final combinations. You can use lists or arrays for this purpose.
Implement a Recursive Algorithm:

Implement a recursive algorithm to generate all possible combinations of ingredients. The recursive function will have the following parameters:
Current ingredient being considered.
Current sum of points.
Current selection of ingredients.
List to store valid combinations.
Base Cases:

Within the recursive function, handle the following base cases:
If the current sum of points equals N, add the current selection to the list of valid combinations.
If the current sum exceeds N or you have considered all ingredients, backtrack (return from the function).
Recursive Calls:

For each ingredient, you have two choices:
Include the ingredient in the current selection and subtract its points from the remaining limit.
Exclude the ingredient and move to the next one.
Make recursive calls for both choices.
Backtracking:

During the recursion, make sure to backtrack by removing the last added ingredient from the current selection to explore other possibilities.
Output:

After running the recursive algorithm, you will have a list of all valid combinations of ingredients that meet the point limit.
*/