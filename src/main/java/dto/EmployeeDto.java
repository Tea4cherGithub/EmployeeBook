package dto;

import java.time.LocalDateTime;


public class EmployeeDto {

    private String name;

    private String city;

    private LocalDateTime created;

    public EmployeeDto(String name, String city, LocalDateTime created) {
        this.name = name;
        this.city = city;
        this.created = created;
    }

    public static EmployeeDto.EmployeeDtoBuilder builder() {
        return new EmployeeDto.EmployeeDtoBuilder();
    }

    public static class EmployeeDtoBuilder {
        private String name;
        private String city;
        private LocalDateTime created;

        EmployeeDtoBuilder() {}

        public EmployeeDto.EmployeeDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeDto.EmployeeDtoBuilder city(String city) {
            this.city = city;
            return this;
        }

        public EmployeeDto.EmployeeDtoBuilder created(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public EmployeeDto build() {
            return new EmployeeDto(this.name, this.city, this.created);
        }
    }

    @Override
    public String toString() {
        return String.format("{Employee} | created - %s, name - %s, city - %s.", this.created, this.name, this.city);
    }
}
