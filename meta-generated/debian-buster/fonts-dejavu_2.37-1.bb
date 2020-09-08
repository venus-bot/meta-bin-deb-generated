PACKAGES = "${PN} fonts-dejavu-core"
PROVIDES = "fonts-dejavu-core"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/f/fonts-dejavu/fonts-dejavu-core_2.37-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_fonts-dejavu-core = "fonts-dejavu-core_2.37-1_all.deb"
SRC_URI[deb0.sha256sum] = "58d21a255606191e6512cca51f32c4480e7a798945cc980623377696acfa3cfc"
SRC_URI[deb0.md5sum] = "5f413fbf5c17b6417affa23aafe587ee"

RDEPENDS_${PN}-core = ""

inherit deb_group

FILES_fonts-dejavu-core = " \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-lgc-serif.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-sans-mono.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-sans.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-serif.conf \
    ./etc/fonts/conf.avail/57-dejavu-sans-mono.conf \
    ./etc/fonts/conf.avail/57-dejavu-sans.conf \
    ./etc/fonts/conf.avail/57-dejavu-serif.conf \
    ./etc/fonts/conf.avail/58-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.avail/58-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.avail/58-dejavu-lgc-serif.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-lgc-serif.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-sans-mono.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-sans.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-serif.conf \
    ./etc/fonts/conf.d/57-dejavu-sans-mono.conf \
    ./etc/fonts/conf.d/57-dejavu-sans.conf \
    ./etc/fonts/conf.d/57-dejavu-serif.conf \
    ./etc/fonts/conf.d/58-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.d/58-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.d/58-dejavu-lgc-serif.conf \
    ./usr/share/doc/fonts-dejavu-core/AUTHORS \
    ./usr/share/doc/fonts-dejavu-core/BUGS \
    ./usr/share/doc/fonts-dejavu-core/README.md \
    ./usr/share/doc/fonts-dejavu-core/changelog.Debian.gz \
    ./usr/share/doc/fonts-dejavu-core/changelog.gz \
    ./usr/share/doc/fonts-dejavu-core/copyright \
    ./usr/share/doc/fonts-dejavu-core/langcover.txt.gz \
    ./usr/share/doc/fonts-dejavu-core/status.txt.gz \
    ./usr/share/doc/fonts-dejavu-core/unicover.txt.gz \
    ./usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSans.ttf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSansMono-Bold.ttf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSerif-Bold.ttf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf\
"
