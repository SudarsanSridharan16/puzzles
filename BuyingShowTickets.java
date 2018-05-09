package buying.show.tickets;

public class BuyingShowTickets {
	static long waitingTime(int[] tickets, int p) {
		long answer = 0;
		int i = 0;
		int length = tickets.length;
		if (length > p) {
			while (tickets[p] != 0) {
				if (tickets[i] != 0) {
					tickets[i]--;
					answer++;
				}
				if (i == length - 1) {
					i = 0;
				} else {
					i++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] tickets = {5,5,2,3};
		int p = 3;
		System.out.println(waitingTime(tickets,p));
	}
}
