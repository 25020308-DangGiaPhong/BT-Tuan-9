#!/bin/bash

# 1. Lấy chính xác đường dẫn của thư mục đang chứa file run.sh
ROOT_DIR="$(dirname "$0")"

# 2. Di chuyển vào đúng thư mục đó (để đảm bảo Maven luôn tìm thấy file pom.xml)
cd "$ROOT_DIR"

# 3. Chạy lệnh Maven để dọn dẹp, tải thư viện, biên dịch code, chạy test và đóng gói thành .jar
mvn clean package