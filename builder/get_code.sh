#!/bin/bash

# Specify the source folder containing code files
src_folder="/home/nick-ras/Desktop/soft-udv/java-nick/builder/src/main/java/com"

# Specify the output file
output_file="code_output"

# Initialize the output file
> "$output_file"

# Loop through code files in the source folder
for file in "$src_folder"/*.java; do
    # Check if the file exists
    if [ -f "$file" ]; then
        # Append the content of the file to the output file
        cat "$file" >> "$output_file"
        # Add a separator (optional)
        echo -e "\n// End of $file\n" >> "$output_file"
    fi
done

echo "Combined code files into $output_file"