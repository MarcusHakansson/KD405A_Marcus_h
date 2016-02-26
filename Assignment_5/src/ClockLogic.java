import java.text.DecimalFormat;
import java.util.Calendar;

public class ClockLogic {
	private DigitalClockGUI ClockGUI;
	private int alarmHour;
	private int alarmMinute;

	public ClockLogic(DigitalClockGUI digitalClockGUI) {

		this.ClockGUI = digitalClockGUI;
		ClockThread thread = new ClockThread();
		thread.start();
	}

	// Class inside of the class.
	public class ClockThread extends Thread {
		@Override
		public void run() {
			DecimalFormat df = new DecimalFormat("00");
			while (true) {

				Calendar cal = Calendar.getInstance();
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				int min = cal.get(Calendar.MINUTE);
				int sec = cal.get(Calendar.SECOND);

				String time = df.format(hour) + ":" + df.format(min) + ":" + df.format(sec);

				// Sätter tiden på klockan
				ClockGUI.setTimeOnLabel(time);

				if (hour == alarmHour && min == alarmMinute && sec == 00) {
					ClockGUI.activateAlarm(true);

				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}

			}
		}

	}

	public void setAlarm(int hours, int minute) {

		alarmHour = hours;
		alarmMinute = minute;

	}

	public void clearAlarm() {
		
		setAlarm(-1, -1);
		ClockGUI.activateAlarm(false);
		ClockGUI.AlarmTime.setText("");
	}

}
