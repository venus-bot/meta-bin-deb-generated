PACKAGES = "${PN} libcap-ng0"
PROVIDES = "libcap-ng0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libc/libcap-ng/libcap-ng0_0.7.9-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcap-ng0 = "libcap-ng0_0.7.9-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "dcdef924cd4089290bc1c21b867616e8a6f01b860bb7f59cd8d3d4da1dbce5a8"
SRC_URI[deb0.md5sum] = "29566bd5a5d5e03286cb82ad36a2dc4e"

RDEPENDS_${PN}0 = "libc6 (>= 2.8)"
DEPENDS = "libc6"


inherit deb_group

FILES_libcap-ng0 = " \
    ./lib/arm-linux-gnueabihf/libcap-ng.so.0 \
    ./lib/arm-linux-gnueabihf/libcap-ng.so.0.0.0 \
    ./usr/share/doc/libcap-ng0/changelog.Debian.gz \
    ./usr/share/doc/libcap-ng0/changelog.gz \
    ./usr/share/doc/libcap-ng0/copyright\
"
