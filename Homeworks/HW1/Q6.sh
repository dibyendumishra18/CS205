for file in *;do
a=${file%.*}
mkdir $a
mv $file $a
done
