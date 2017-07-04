Set objExcel=CreateObject("Excel.Application")
Dim arg0
Dim arg1
Dim l
Dim s
arg0=Replace(Wscript.Arguments(0),"^"," ")
arg1=Replace(Wscript.Arguments(1),"^"," ")
Set objWorkbook=objExcel.Workbooks.Open(arg0)
Set activeWorkBook = objExcel.ActiveWorkbook
l=activeWorkBook.Worksheets.Count
For i  = 1 to l
Set activeSheet=activeWorkBook.Worksheets(i)
activeSheet.Select
s=activeSheet.Cells(1, "A").Value
If s=arg1 Then 
Exit For
End If
Next
objExcel.Visible=True