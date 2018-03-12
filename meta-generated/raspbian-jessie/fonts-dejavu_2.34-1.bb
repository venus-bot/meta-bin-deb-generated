PACKAGES = "${PN} fonts-dejavu-core"
PROVIDES = "fonts-dejavu-core"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/fonts-dejavu/fonts-dejavu-core_2.34-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_fonts-dejavu-core = "fonts-dejavu-core_2.34-1_all.deb"
SRC_URI[deb0.sha256sum] = "002c9fa9445cfec4964637f22c73265d8a868f0810104452a6c906af52e43dab"
SRC_URI[deb0.md5sum] = "0d4b6b9fff8697ee02bc3664318bd643"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_fonts-dejavu-core = " \
    ./usr/share/doc/fonts-dejavu-core/changelog.Debian.gz \
    ./usr/share/fonts/truetype/dejavu/DejaVuSansMono-Bold.ttf \
    ./etc/fonts/conf.d/57-dejavu-sans.conf \
    ./etc/fonts/conf.avail/58-dejavu-lgc-serif.conf \
    ./etc/fonts/conf.d/58-dejavu-lgc-serif.conf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSerif-Bold.ttf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-serif.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-sans-mono.conf \
    ./etc/fonts/conf.avail/57-dejavu-sans-mono.conf \
    ./usr/share/doc/fonts-dejavu-core/changelog.gz \
    ./usr/share/doc/fonts-dejavu-core/README \
    ./etc/fonts/conf.d/58-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-sans.conf \
    ./etc/fonts/conf.avail/57-dejavu-sans.conf \
    ./usr/share/doc/fonts-dejavu-core/BUGS \
    ./usr/share/fonts/truetype/dejavu/DejaVuSans.ttf \
    ./etc/fonts/conf.avail/58-dejavu-lgc-sans.conf \
    ./usr/share/doc/fonts-dejavu-core/status.txt.gz \
    ./usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf \
    ./usr/share/doc/fonts-dejavu-core/langcover.txt.gz \
    ./usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf \
    ./usr/share/doc/fonts-dejavu-core/AUTHORS \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-serif.conf \
    ./usr/share/doc/fonts-dejavu-core/copyright \
    ./usr/share/doc/fonts-dejavu-core/unicover.txt.gz \
    ./etc/fonts/conf.avail/58-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-lgc-serif.conf \
    ./etc/fonts/conf.d/58-dejavu-lgc-sans-mono.conf \
    ./usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-sans-mono.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.avail/57-dejavu-serif.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-sans.conf \
    ./etc/fonts/conf.d/57-dejavu-sans-mono.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-lgc-sans-mono.conf \
    ./etc/fonts/conf.avail/20-unhint-small-dejavu-lgc-serif.conf \
    ./etc/fonts/conf.d/20-unhint-small-dejavu-lgc-sans.conf \
    ./etc/fonts/conf.d/57-dejavu-serif.conf\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
