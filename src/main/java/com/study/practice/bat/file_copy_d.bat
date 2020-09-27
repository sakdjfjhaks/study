set a=0
set infile=1.mp4
:abc

set /a a+=1
set outfile=D:\666\%date:~0,4%%date:~5,2%%date:~8,2%%time:~0,2%%time:~3,2%%time:~6,2%%time:~9,2%%a%.pdf
copy %infile% %outfile%


goto abc