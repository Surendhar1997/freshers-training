package dao;

import jakarta.annotation.Nonnull;

public record EmployeeAddDto(
		@Nonnull
		Integer departmentId,
		String name,
		String position) {

}
