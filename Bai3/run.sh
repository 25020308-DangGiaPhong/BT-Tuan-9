#!/bin/bash

# 1. Lấy đường dẫn của thư mục hiện tại (nơi chứa file run.sh)
ROOT_DIR=$(pwd)

# 2. Di chuyển vào đúng thư mục đó (để đảm bảo tìm thấy file pom.xml)
cd "$ROOT_DIR"

# 3. Chạy lệnh Maven để dọn dẹp, tải thư viện, biên dịch code và chạy các bài test
mvn clean test