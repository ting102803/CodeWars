//https://www.codewars.com/kata/57eae65a4321032ce000002d

void fakeBin(const char *digits, char *buffer) {
int i = 0;
memset(buffer, 0x00, sizeof(char) * (strlen(digits)+1) );
	for (i = 0; i < strlen(digits); i++) {
		if ((int)digits[i] < '5') 
			buffer[i] = '0';
		else buffer[i] = '1';
	}
}