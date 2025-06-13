# 📘 TRAINING INTERNSHIP PROJECT

---

## 🚀 Bắt Đầu1

### 1. Clone repository
```bash
git clone https://github.com/DPasdasdsa/Trainning.git
cd Trainning

### 2. Quy trình làm việc với Git

# Bước 1: Về lại nhánh master và cập nhật code mới nhất
git checkout master
git pull origin master

# Bước 2: Tạo nhánh mới cho một bài tập
git checkout -b feature_130625_tenbaitap

    📌 Quy ước đặt tên nhánh:
        Dạng: feature_<ngày>_<tên-bài-tập>
        ngày: theo định dạng ddmmyy (vd: 130625)

        tenbaitap: viết bằng tiếng Anh, không dấu, không viết hoa

# Bước 3: Sau khi hoàn thành bài tập, lưu thay đổi và commit
git add .
git commit -m "tạo giao diện login form"

    📌 Quy tắc viết commit message:
            Viết bằng tiếng Anh

            Mô tả một hành động cụ thể  đã làm

            Một số prefix hay dùng:

            feature: thêm chức năng mới

            fix: sửa lỗi

            refactor: cải tiến code

            style: chỉnh định dạng

# Bước 4: Push nhánh mới lên GitHub
    git push origin feature_130625_tenbaitap

# Bước 5:  Tạo Pull Request (PR) với nhánh master.

# Bước 6: Gửi link PR cho a Thành review và merge vào master.

