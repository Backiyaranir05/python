import xlrd
workbook = xlrd.open_workbook("file_name.xlsx")
sheet = workbook.sheet_by_index(0)
print([[sheet.cell_value(r,c) for c in range(sheet.ncols)] for c in range(sheet.ncols)])
