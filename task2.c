#include <stdio.h>
#include <time.h>

int main()
{
	time_t currentTime;
	currentTime = time(NULL);
	int d = 0, m = 0, y = 0, h = 0, min = 0;
	printf("Enter your date: ");
	scanf("%d.%d.%d %d:%d", &d, &m, &y, &h, &min);

	struct tm *t;

	t = malloc(sizeof(struct tm));

	t->tm_mday = d;
	t->tm_mon = m - 1;
	t->tm_year = y - 1900;

	t->tm_hour = h;
	t->tm_min = min;
	t->tm_sec = 0;
	t->tm_wday = 0;


	time_t newTime;
	newTime = mktime(t);

	double delta = 0;
	delta = difftime(currentTime, newTime);

	printf("You age in seconds: %lf\n", delta);

	return 0;
}
