PACKAGES = "${PN} libkeyutils1"
PROVIDES = "libkeyutils1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/k/keyutils/libkeyutils1_1.6-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libkeyutils1 = "libkeyutils1_1.6-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "ee0948ea16c2520d5a8612ba74c95c820966ed8dba78334729aef37571161d58"
SRC_URI[deb0.md5sum] = "be4edab167b70252e43cd0c65430f779"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libkeyutils1 = " \
    ./lib/arm-linux-gnueabihf/libkeyutils.so.1 \
    ./lib/arm-linux-gnueabihf/libkeyutils.so.1.8 \
    ./usr/share/doc/libkeyutils1/changelog.Debian.gz \
    ./usr/share/doc/libkeyutils1/copyright\
"
