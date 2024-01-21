package com.ead.notification.adapters.dtos;

import com.ead.notification.core.domains.enums.NotificationStatus;
import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
public class NotificationDto {

    @NotNull
    private NotificationStatus notificationStatus;
}
