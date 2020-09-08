PACKAGES = "${PN} libcap-ng0"
PROVIDES = "libcap-ng0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libc/libcap-ng/libcap-ng0_0.7.9-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcap-ng0 = "libcap-ng0_0.7.9-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "5218a1d5d264620e027391df53c66ddc3cb5715e0aa6065238118fa3515b5e7b"
SRC_URI[deb0.md5sum] = "dd3b8e8541fa8a16b4ab0abf5503d638"

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
