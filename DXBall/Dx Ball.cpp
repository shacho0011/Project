#include "iGraphics.h"
#include "time.h"

void Welcome();
void Info();
void Help();
void Back();
void Exit();
void Stage();
void BallPaddle();
void MovePaddle();
void MoveBall();
void MoveSpecial();
void CatchSpecial();
void Breaker();
void dBallPaddle();
void S();

int bx = 465;
int by = 35;
int dpx = 410;
int dpy = 10;
int dx; 
double dy;
int px = dpx;
int py = dpy;
int tbx = dpx;
int rx;
int ry;
int r; 
int c;
int score = 0;
char Show_score[30];
int life = 3;
char Show_life[30];
int temp = 0;
int spx, spy, smx, smy, sdx, sdy, sax, say;
int lpx = 0;

int f_click = 0, f_ball = 0, f_Stage = 1, f_mp = 0, f_life = 0, f_next=1, f_show=0, f_plus = 0, f_minus = 0, f_aid = 0, f_danger = 0;

int active[12][16];
int one[12][16] = {
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
					0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 0, 0,
					0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
					0, 0, 1, 1, 2, 1, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0,
					0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
					0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
					0, 0, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
					0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

int two[12][16]={
					1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
					0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1,
					1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
					0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1,
					1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
					0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1,
					1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
					0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1,
					1, 0, 3, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
					0, 1, 0, 1, 0, 1, 0, 5, 0, 1, 0, 4, 0, 1, 0, 1,
					1, 0, 1, 0, 1, 0, 1, 0 ,1, 0, 1, 0, 1, 0, 1, 0,
					0, 1, 0, 1, 0, 1, 0, 1, 0, 5, 0, 1, 0, 1, 0, 2};

int three[12][16]={
					1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0,
					1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0,
					1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0,
					0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0,
					0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0,
					0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0,
					0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0,
					0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1,
					0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1};

void iDraw(){
	iClear();
	if (f_click == 0)Welcome();
	else if (f_click == 1){
		if (f_life == 0)Stage();
		else if(f_life == 1) iText(430, 340, "Game Over!", GLUT_BITMAP_TIMES_ROMAN_24);
	}
	else if (f_click == 2)Info();
	else if (f_click == 3)Help();
}

void Welcome(){
	iSetcolor(.5, .4, .3);
	iRectangle(5, 5, 990, 590);

	iSetcolor(1, 0.1, 0.6);
	iRectangle(430, 540, 120, 35);
	iText(450, 550, "DX Ball", GLUT_BITMAP_TIMES_ROMAN_24);

	iSetcolor(.30, .75, .20);
	iFilledRectangle(430, 350, 120, 50);
	iSetcolor(.25, .5, .35);
	iRectangle(433, 353, 114, 44);
	iSetcolor(1, 1, 1);
	iText(450, 370, "START", GLUT_BITMAP_TIMES_ROMAN_24);

	iSetcolor(0, 0, 1);
	iFilledRectangle(100, 160, 120, 50);
	iSetcolor(.5, .5, .3);
	iRectangle(103, 163, 114, 44);
	iSetcolor(.25, .5, .35);
	iSetcolor(1, 1, 1);
	iText(137, 180, "Info", GLUT_BITMAP_TIMES_ROMAN_24);

	iSetcolor(0, 0, 1);
	iFilledRectangle(240, 160, 120, 50);
	iSetcolor(.5, .5, .5);
	iRectangle(243, 163, 114, 44);
	iSetcolor(1, 1, 1);
	iText(277, 180, "Help", GLUT_BITMAP_TIMES_ROMAN_24);

	iSetcolor(0, 0, 1);
	iFilledRectangle(378, 160, 120, 50);
	iSetcolor(.5, .5, .5);
	iRectangle(381, 163, 114, 44);
	iSetcolor(1, 1, 1);
	iText(400, 180, "Settings", GLUT_BITMAP_TIMES_ROMAN_24);

	iSetcolor(0, 0, 1);
	iFilledRectangle(522, 160, 150, 50);
	iSetcolor(.5, .5, .5);
	iRectangle(525, 163, 144, 44);
	iSetcolor(1, 1, 1);
	iText(538, 180, "High Scores", GLUT_BITMAP_TIMES_ROMAN_24);

	iSetcolor(0, 0, 1);
	iFilledRectangle(695, 160, 120, 50);
	iSetcolor(.5, .5, .5);
	iRectangle(698, 163, 114, 44);
	iSetcolor(1, 1, 1);
	iText(735, 180, "Exit", GLUT_BITMAP_TIMES_ROMAN_24);
}

void Info(){
	iSetcolor(.5, .4, .3);
	iRectangle(5, 5, 990, 590);

	iSetcolor(.01, 0, 1);
	iText(100, 500, "Hi, This is DX Ball, which is very known to you.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 470, "This time we developed this game.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 440, "Keep in touch, Enjoy our DX Ball.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 410, "Thank You.....", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 380, "H. M. A. Mohit Chowdhury & Md. Ariffuzzaman Chowdhury Arif", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 350, "Department of Computer Science and Engineering.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 320, "Ahsanullah University of Science and Technology", GLUT_BITMAP_TIMES_ROMAN_24);
	/*iShowBMP(300,100, "Shadhin.bmp");
	iShowBMP(520,100, "Arif.bmp");*/
	Back();
	Exit();
}

void Help(){
	iSetcolor(.5, .4, .3);
	iRectangle(5, 5, 990, 590);

	iSetcolor(.01, 0, 1);
	iText(100, 500, "Hi, This is DX Ball.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 470, "This is your help desk.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 440, "1. Use A for Left & D for Right.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 410, "2. Use Mouse to throw the ball.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 380, "3. Use Esc for quit the game.", GLUT_BITMAP_TIMES_ROMAN_24);
	iText(100, 350, "Thank You", GLUT_BITMAP_TIMES_ROMAN_24);
	Back();
	Exit();
}

void Back(){
	iSetcolor(0, 0, 1);
	iFilledRectangle(800, 100, 120, 50);
	iSetcolor(1, 0, 1);
	iText(835, 120, "Back", GLUT_BITMAP_TIMES_ROMAN_24);
}

void Exit(){
	iSetcolor(0, 0, 1);
	iFilledRectangle(100, 100, 120, 50);
	iSetcolor(1, 0, 1);
	iText(135, 120, "Exit", GLUT_BITMAP_TIMES_ROMAN_24);
}

void HighScores(){
	iSetcolor(.5, .4, .3);
	iRectangle(5, 5, 990, 590);

	iSetcolor(.01, 0, 1);
	iFilledRectangle(75, 300, 250, 400);
}

void Breaker(){
	if (temp == 96){
		f_next++;
		f_Stage = 1;
		temp = 0;
		f_ball = 0;
		dBallPaddle();
	}

	for (r = 0, ry = 520; r<12, ry >= 245; r++, ry = ry - 25)
		for (c = 0, rx = 25; c<16, rx <= 925; c++, rx = rx + 60)
			if (active[r][c] == 1 || active[r][c] == 1 || active[r][c] == 2  || active[r][c] == 3 || active[r][c] == 4 || active[r][c] == 5){
				
				if (bx >= rx && bx <= rx + 60 && (by + 4 == ry || by + 4 == ry + 30)){

					if(active[r][c] == 2) f_show=2;
					if(active[r][c] == 3) f_show=3;
					if(active[r][c] == 4) f_show=4;
					if(active[r][c] == 5) f_show=5;
					dy = -dy;
					score = score + 10;	
					temp++;
					active[r][c] = 0;
				}
				else if (by >= ry && by <= ry + 30 && (bx + 4 == rx || bx + 4 == rx + 60)){

					if(active[r][c] == 2) f_show=2;
					if(active[r][c] == 3) f_show=3;
					if(active[r][c] == 4) f_show=4;
					if(active[r][c] == 5) f_show=5;
					dx = -dx;
					score = score + 10;
					temp++;
					active[r][c] = 0;
				}
			}	
}

void Stage(){

		if (f_Stage == 1){
		if (f_next == 1)
		for (int i = 0; i < 12; i++)
		for (int j = 0; j < 16; j++)
			active[i][j] = one[i][j];
		else if (f_next == 2)
		for (int i = 0; i < 12; i++)
		for (int j = 0; j < 16; j++)
			active[i][j] = two[i][j];
		else if (f_next == 3)
		for (int i = 0; i < 12; i++)
		for (int j = 0; j < 16; j++)
			active[i][j] = three[i][j];

		f_Stage = 0;
	}

	iSetcolor(.1, .9, .5 );
	for (r = 0, ry = 520; r<12, ry >= 245; r++, ry = ry - 25)
		for (c = 0, rx = 25; c<16, rx <= 925; c++, rx = rx + 60){
			if (active[r][c] == 1 || active[r][c] == 2  || active[r][c] == 3 || active[r][c] == 4 || active[r][c] == 5){
				iFilledRectangle(rx, ry, 52, 17);

				if(active[r][c] == 2 && f_show == 0){
					spx = rx;
					spy = ry;
				}
				if(active[r][c] == 3 && f_show == 0){
					smx = rx;
					smy = ry;
				}
				if(active[r][c] == 4 && f_show == 0){
					sax = rx;
					say = ry;
				}
				if(active[r][c] == 5 && f_show == 0){
					sdx = rx;
					sdy = ry;
				}
			}
			if (f_show == 2) iShowBMP(spx, spy, "plus.bmp");
			if (f_show == 3) iShowBMP(smx, smy, "minus.bmp");
			if (f_show == 4) iShowBMP(sax, say, "first_aid.bmp");
			if (f_show == 5) iShowBMP(sdx, sdy, "danger.bmp");
		}

	BallPaddle();
	iSetcolor(.9, .75, .5);
	sprintf(Show_score, "Score :: %d", score);
	iSetcolor(1, 1, 1);
	iText(850, 580, Show_score, GLUT_BITMAP_TIMES_ROMAN_24);

	sprintf(Show_life, "Life :: %d", life);
	iSetcolor(1, 1, 1);
	iText(30, 580, Show_life, GLUT_BITMAP_TIMES_ROMAN_24);
}

void MoveSpecial(){
	if(f_show == 2 || f_show == 3 || f_show == 4 || f_show == 5){
		if(spy >= 34){
			spy--;
		}
		else if(spy < 34) f_show = 0;
		
		if(smy > 34){
			smy--;
		}
		else if(smy < 34) f_show = 0;
		
		if(say >= 34){
			say--;
			if(say == 33) f_show = 0;
		}
		
		if(sdy >= 34){
			sdy--;
		}
		else if(sdy < 34) f_show = 0;
	}
}

void CatchSpecial(){
	if(!(spx < px || spx+30 > px + 100) && spy == 34){
		if(f_show == 2){
			f_plus = 1;
			f_show = 0;
			px = px-25;

		}
	}
	if(!(smx < px || smx+30 > px + 100) && smy == 34){
		if(f_show == 3){
			f_minus = 1;
			f_show = 0;
			px = px + 25; 

		}
	}
	if(!(sax < px || sax+30 > px + 100) && say == 34){
		printf(" Khanki 03 ");
		if(f_show == 4){
			//f_aid = 1;
			f_show = 0;

			life++;
		}
	}
	if(!(sdx < px || sdx+30 > px + 100) && sdy == 34){
		if(f_show == 5){
			//f_danger = 1;
			f_show = 0;
			f_life = 1;

		}
	}
}

void dBallPaddle(){
	f_ball = 0;
	iSetcolor(0.2, 1, 0.2);
	iFilledRectangle(dpx, dpy, 100, 15);

	iSetcolor(1, 0.2, 0.3);
	if (f_ball == 0){
		iFilledCircle(tbx + 50, by, 8, 100);
		bx = tbx + 50;
	}
	if (f_ball == 1)iFilledCircle(bx, by, 8, 100);

	px = dpx;
	py = dpy;
	tbx = dpx;
	bx = dpx + 50;
	by = dpy + 25;
}

void BallPaddle(){

	if(f_plus == 1) {
		iSetcolor(0.2, 1, 0.2);
		iFilledRectangle(px, py, 150, 15);
	}
	else if(f_minus == 1){
		iSetcolor(0.2, 1, 0.2);
		iFilledRectangle(px, py, 75, 15);
	}
	else{
		iSetcolor(0.2, 1, 0.2);
		iFilledRectangle(px, py, 100, 15);
	}

	iSetcolor(1, 0.2, 0.3);
	if (f_ball == 0){
		iFilledCircle(tbx + 50, by, 8, 100);
		bx = tbx + 50;
	}
	if (f_ball == 1)iFilledCircle(bx, by, 8, 100);
}

void MoveBall(){

	CatchSpecial();
	Breaker();
	if(f_ball==1){
		bx = bx + dx;
		by = by + dy;
		if (bx > 990 || bx < 10) dx = -dx;
		/*if (by>570 || by < 35){
			if (by > 570)dy = -dy;
			else if (bx < px || bx > px + 100){
				if (by < 35){ 
					dBallPaddle();
					life--;
					if (life == 0)f_life = 1;
				}
			}
			else  dy = -dy;
		}*/


	if(f_plus == 1){
		if (by>570 || by < 35){
			if (by > 570)dy = -dy;
			else if (bx < px - 25 || bx > px +150){
				if (by < 35){ 
					dBallPaddle();
					life--;
					if (life == 0)f_life = 1;
				}
			}
			else  dy = -dy;
		}
	}
	else if(f_minus == 1){
		if (by>570 || by < 35){
			if (by > 570)dy = -dy;
			else if (bx < px - 25 || bx > px + 75){
				if (by < 35){ 
					printf("\nReal Khanki");
					dBallPaddle();
					life--;
					if (life == 0)f_life = 1;
				}
			}
			else  dy = -dy;
		}
	}
	else {
		if (by>570 || by < 35){
			if (by > 570)dy = -dy;
			else if (bx > px && bx< px + 100){
				if (by < 35){
					if(bx>px+30&&bx<=px+70){
					dy = -dy; 
					dy=2;
				}
				else {
					dy=-dy; 
					dy=1;
				}
					/*
					else if (bx > px && bx< px + 100)
						if (by<35){
					*/
				}
			}
			else  {
				dBallPaddle();
				life--;
				if (life == 0)f_life = 1;
			}
		}
	}
	}

	


}

void MovePaddle(){
	if (f_mp == 1 && px>10){
		px = px - 20;
		tbx = tbx - 20;
		f_mp = 0;
	}
	if (f_mp == 3 && px < 890){
			px = px + 20;
			tbx = tbx + 20;
			f_mp = 0;
		
	}
}

void iMouseMove(int mx, int my){
}

void iMouse(int button, int state, int mx, int my){
	if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN){
		if (f_click == 1)if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN)f_ball = 1;
		if (f_click == 0)if (mx >= 430 && mx <= 550 && my >= 350 && my <= 400)f_click = 1;
		if (f_click == 0)if (mx >= 100 && mx <= 220 && my >= 160 && my <= 210)f_click = 2;
		if (f_click == 0)if (mx >= 240 && mx <= 360 && my >= 160 && my <= 210)f_click = 3;
		if (f_click == 2 || f_click == 3)if (mx >= 800 && mx <= 920 && my >= 120 && my <= 170) f_click = 0;
		if (f_click == 2 || f_click == 3)if (mx >= 100 && mx <= 220 && my >= 100 && my <= 150) exit(0);
		if (f_click == 0)if (mx >= 695 && mx <= 815 && my >= 160 && my <= 210)exit(0);
	}
}

void iKeyboard(unsigned char key){
	if (key == 27)exit(0);
	if (key == 'a' || key == 'A'){
		f_mp = 1;
		MovePaddle();
	}
	if (key == 'd' || key == 'D'){
		f_mp = 3;
		MovePaddle();
	}
}


int main(){
	iSettimer(1, MoveBall);
	iSettimer(50, MoveSpecial);
	dx = 1;
	dy = 1;
	iInitialize(1000, 600, ":: DX-Ball ::");
	return 0;
}