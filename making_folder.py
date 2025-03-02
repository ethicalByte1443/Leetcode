import os

# Target directory path
base_path = r"C:\Users\Aseem\Documents\VS_CODE\Leetcode-solution\Leetcode\Leetcode\February, 2025"

# Ensure the directory exists
os.makedirs(base_path, exist_ok=True)

# Create folders for February (1 to 28)
for day in range(1, 29):
    folder_name = f"feb_{day}_leet"
    folder_path = os.path.join(base_path, folder_name)
    os.makedirs(folder_path, exist_ok=True)

print("Folders created successfully!")
