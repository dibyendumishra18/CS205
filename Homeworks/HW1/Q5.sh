for a in *; do mv "$a" "$(echo $a|tr a-z A-Z)";done
