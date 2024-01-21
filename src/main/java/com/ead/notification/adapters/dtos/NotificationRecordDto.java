package com.ead.notification.adapters.dtos;

import com.ead.notification.core.domains.enums.NotificationStatus;
import jakarta.validation.constraints.NotNull;

// auto-generate constructors, gets... Records are unmuted, therefore there's no set methods.
public record NotificationRecordDto(@NotNull NotificationStatus notificationStatus) {
}
