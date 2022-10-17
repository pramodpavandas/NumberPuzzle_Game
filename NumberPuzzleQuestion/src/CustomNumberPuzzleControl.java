import java.awt.*;

class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
		
		if (emptyCellId == 0) {
			if (Integer.parseInt(buttons[1].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[1]);
				return 1;
			}
			else if (Integer.parseInt(buttons[4].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[4]);
				return 4;
			}
		}
		else if (emptyCellId == 1) {
			if (Integer.parseInt(buttons[0].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[0]);
				return 0;
			}
			else if (Integer.parseInt(buttons[2].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[2]);
				return 2;
			}
			else if (Integer.parseInt(buttons[5].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[5]);
				return 5;
			}
		}
		else if (emptyCellId == 2) {
			if (Integer.parseInt(buttons[1].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[1]);
				return 1;
			}
			else if (Integer.parseInt(buttons[3].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[3]);
				return 3;
			}
			else if (Integer.parseInt(buttons[6].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[6]);
				return 6;
			}
		}
		else if (emptyCellId == 3) {
			if (Integer.parseInt(buttons[2].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[2]);
				return 2;
			}
			else if (Integer.parseInt(buttons[7].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[7]);
				return 7;
			}
		}
		else if (emptyCellId == 4) {
			if (Integer.parseInt(buttons[0].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[0]);
				return 0;
			}

			else if (Integer.parseInt(buttons[5].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[5]);
				return 5;
			}

			else if (Integer.parseInt(buttons[8].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[8]);
				return 8;
			}
		}
		else if (emptyCellId == 5) {
			if (Integer.parseInt(buttons[1].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[1]);
				return 1;
			}

			else if (Integer.parseInt(buttons[4].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[4]);
				return 4;
			}

			else if (Integer.parseInt(buttons[6].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[6]);
				return 6;
			}

			else if (Integer.parseInt(buttons[9].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[9]);
				return 9;
			}
		}
		else if (emptyCellId == 6) {
			if (Integer.parseInt(buttons[2].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[2]);
				return 2;
			}

			else if (Integer.parseInt(buttons[5].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[5]);
				return 5;
			}

			else if (Integer.parseInt(buttons[7].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[7]);
				return 7;
			}

			else if (Integer.parseInt(buttons[10].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[10]);
				return 10;
			}
		}
		else if (emptyCellId == 7) {
			if (Integer.parseInt(buttons[3].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[3]);
				return 3;
			}

			else if (Integer.parseInt(buttons[6].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[6]);
				return 6;
			}

			else if (Integer.parseInt(buttons[11].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[11]);
				return 11;
			}
		}
		else if (emptyCellId == 8) {
			if (Integer.parseInt(buttons[4].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[4]);
				return 4;
			}

			else if (Integer.parseInt(buttons[9].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[9]);
				return 9;
			}

			else if (Integer.parseInt(buttons[12].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[12]);
				return 12;
			}
		}
		else if (emptyCellId == 9) {
			if (Integer.parseInt(buttons[5].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[5]);
				return 5;
			}

			else if (Integer.parseInt(buttons[8].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[8]);
				return 8;
			}

			else if (Integer.parseInt(buttons[10].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[10]);
				return 10;
			}

			else if (Integer.parseInt(buttons[13].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[13]);
				return 13;
			}
		}
		else if (emptyCellId == 10) {
			if (Integer.parseInt(buttons[6].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[6]);
				return 6;
			}

			else if (Integer.parseInt(buttons[9].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[9]);
				return 9;
			}

			else if (Integer.parseInt(buttons[11].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[11]);
				return 11;
			}

			else if (Integer.parseInt(buttons[14].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[14]);
				return 14;
			}
		}
		else if (emptyCellId == 11) {
			if (Integer.parseInt(buttons[7].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[7]);
				return 7;
			}

			else if (Integer.parseInt(buttons[10].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[10]);
				return 10;
			}

			else if (Integer.parseInt(buttons[15].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[15]);
				return 15;
			}
		}
		else if (emptyCellId == 12) {
			if (Integer.parseInt(buttons[8].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[8]);
				return 8;
			}

			else if (Integer.parseInt(buttons[13].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[13]);
				return 13;
			}
		}
		else if (emptyCellId == 13) {
			if (Integer.parseInt(buttons[9].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[9]);
				return 9;
			}

			else if (Integer.parseInt(buttons[12].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[12]);
				return 12;
			}

			else if (Integer.parseInt(buttons[14].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[14]);
				return 14;
			}
		}
		else if (emptyCellId == 14) {
			if (Integer.parseInt(buttons[10].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[10]);
				return 10;
			}

			else if (Integer.parseInt(buttons[13].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[13]);
				return 13;
			}

			else if (Integer.parseInt(buttons[15].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[15]);
				return 15;
			}
		}
		else if (emptyCellId == 15) {
			if (Integer.parseInt(buttons[11].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[11]);
				return 11;
			}

			else if (Integer.parseInt(buttons[14].getLabel()) == Integer.parseInt(buttonClicked.getLabel())) {
				swapButton(buttons[emptyCellId], buttons[14]);
				return 14;
			}
		}
		return emptyCellId;

	}
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];
		
		int a = getRandomNumber();
		int i=0;
		boolean duplicate =false;

		while (i<15) {
			if (a < 16 && a > 0) {
				duplicate = false;
	
				for(int j=0; j<i; j++){
					if (arr[j] == a) {
						duplicate = true;
						break;
					}
				}
	
				if (duplicate) {
					a = getRandomNumber();
				}
	
				else {
					arr[i] = a;
					i++;
					a = getRandomNumber();
				}
			}
			else {
				a = getRandomNumber();
			}
		}
		
		return arr;
	}
	
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		int[] arr = getIntegerArrayOfButtonIds(buttons);
		for(int i=0; i<14; i++) {
			for (int j=i+1; j<15; j++) {
				if (arr[j] < arr[i]) {
					winner = false;
					break;
				}
			}
			if (!winner) {
				break;
			}
		}

		return winner;
	}
}