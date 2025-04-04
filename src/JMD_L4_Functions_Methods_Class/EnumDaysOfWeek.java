package JMD_L4_Functions_Methods_Class;

public enum EnumDaysOfWeek {
	
	// Enum constantes (liste de jour)
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Optionnel
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
