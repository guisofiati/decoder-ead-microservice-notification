package com.ead.notification.core.ports;

import com.ead.notification.core.domains.NotificationDomain;
import com.ead.notification.core.domains.PageInfo;
import com.ead.notification.core.domains.enums.NotificationStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotificationPersistencePort {

    NotificationDomain save(NotificationDomain notification);
    List<NotificationDomain> findAllByUserNotificationStatus(UUID userId, NotificationStatus notificationStatus, PageInfo pageInfo);
    Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
