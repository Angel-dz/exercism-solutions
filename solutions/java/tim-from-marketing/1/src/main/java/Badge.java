class Badge {
    public String print(Integer id, String name, String department) {
        String badgeDepartment = department == null ?  "OWNER" : department.toUpperCase();
        if (id != null) {
            return "[" + id + "] - " + name + " - " + badgeDepartment; 
        } else {
            return name + " - " + badgeDepartment;
        }
    }
}
