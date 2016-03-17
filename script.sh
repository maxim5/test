for i in {2..5}; do git checkout master && git checkout -b brach$i && echo "? $i" >> README.md && git add README.md && git commit -m "update README $i" && git push origin HEAD:branch$i; done;
