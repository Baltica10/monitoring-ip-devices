INSERT INTO device_type (type, description) VALUES ('MFU', 'МФУ');
INSERT INTO device_type (type, description) VALUES ('IPCAM', 'IP камера');
INSERT INTO device_type (type, description) VALUES ('IPTEL', 'IP телефон');

INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.20', '255.255.255.0', 'C:/Users/User/Desktop/response.html');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.20', '255.255.255.0', 'C:/Users/User/Desktop/response.html');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.20', '255.255.255.0', 'C:/Users/User/Desktop/response.html');

INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M1536dnf', 'CNG8G184WR', 'HP', 1, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M225rdn', 'CNB6J9J45D', 'HP', 2, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M227sdn', 'VNF3R20722', 'HP', 3, 1);
