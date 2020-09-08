PACKAGES = "${PN} libcom-err2"
PROVIDES = "libcom-err2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/e2fsprogs/libcom-err2_1.44.5-1+deb10u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcom-err2 = "libcom-err2_1.44.5-1+deb10u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "0600d7a2c4598481a0d83e0e996048e6b79ee24b995dd4554e9f1fb635620568"
SRC_URI[deb0.md5sum] = "1d4328fa903f5ca258311456f413c0ed"

RDEPENDS_libcom-err2 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libcom-err2 = " \
    ./lib/arm-linux-gnueabihf/libcom_err.so.2 \
    ./lib/arm-linux-gnueabihf/libcom_err.so.2.1 \
    ./usr/share/doc/libcom-err2/changelog.Debian.gz \
    ./usr/share/doc/libcom-err2/copyright\
"
