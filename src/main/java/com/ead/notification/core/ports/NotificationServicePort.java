package com.ead.notification.core.ports;

import com.ead.notification.core.domains.NotificationDomain;
import com.ead.notification.core.domains.PageInfo;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotificationServicePort {
    NotificationDomain saveNotification(NotificationDomain notificationDomain);

    List<NotificationDomain> findAllNotificationsByUser(UUID userId, PageInfo pageable);

    Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
