#!/bin/bash

process_file() {
    echo "$1"
}

rec_traverse() {
    local file_or_dir
    for file_or_dir in "$1"/*; do
        [[ -d $file_or_dir ]] && rec_traverse "$file_or_dir"
        [[ -f $file_or_dir ]] && process_file "$file_or_dir"
    done
}

rec_traverse "${MEDIA3_ROOT}"/libraries/decoder_ffmpeg/
