# CSE142-Spring2021-Assessment3-CafeWall
Take-home Assessment 3: Cafe Wall

## Part A: Doodle
The first part of your assessment is to write a program that uses DrawingPanel to produce an image of your choice. Your program can produce any image you like, with the following restrictions:
- The image should not include hateful, offensive, or otherwise inappropriate images.
- The image must be at least 100×100 pixels and must contain at least three distinct shapes and at least two distinct colors.
- The image must not be substantially similar to your solution for Part B, consist entirely of reused Part B code, or be substantially similar to a related CSE 142 assignments from a previous quarter or any examples from class.
- The code must successfully compile and run, and must not enter an infinite loop.
- The code must not use material beyond Supplement 3G of the textbook.

This part of the assessment will only contribute to the Behavior dimension grade. It will not factor in to grading on the other dimensions.

## Part B: Café Wall
The second part of your assessment is to produce an image that demonstrates what is known as the Café Wall illusion. Your program should produce the following image:

![Screenshot 2023-09-15 at 11 16 07 AM](https://github.com/zkornas/CSE142-Spring2021-Assessment3-CafeWall/assets/97088563/772a7d62-61c5-4a53-a4e0-21becd25520e)

This image is drawn on a 650×400 pixel DrawingPanel with a Color.GRAY background. The image consists of four grids made up of rows, along with two stand-alone rows. Each row consists of pairs of black and white boxes, with a blue ’X’ drawn over each black box. We will ask you to draw your box pairs in a specific order: Alternate between black boxes first, then blue Xs, then white boxes. In order to pass our tests 100%, you need to make sure that every shape in the rows is being drawn in the right order. Each grid consists of pairs of rows, with the second row in each pair offset to the right by a certain number of pixels (potentially zero). Each grid is also a square; that is, the number of row pairs in the grid is equal to the number of box pairs in each row of that grid.

You can read the full specification here(https://courses.cs.washington.edu/courses/cse142/21sp/files/assessments/a3/a3.pdf)


