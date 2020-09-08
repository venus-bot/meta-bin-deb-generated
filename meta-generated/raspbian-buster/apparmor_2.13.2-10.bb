PACKAGES = "${PN} libapparmor1"
PROVIDES = "libapparmor1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/apparmor/libapparmor1_2.13.2-10_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libapparmor1 = "libapparmor1_2.13.2-10_armhf.deb"
SRC_URI[deb0.sha256sum] = "ba671adf8b22d4a84f007016274b4aed5d26013553766e61f0e875070544b12b"
SRC_URI[deb0.md5sum] = "d6d801701fd3c4d279f933d40f1ace7e"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

FILES_libapparmor1 = " \
    ./lib/arm-linux-gnueabihf/libapparmor.so.1 \
    ./lib/arm-linux-gnueabihf/libapparmor.so.1.6.0 \
    ./usr/share/doc/libapparmor1/changelog.Debian.gz \
    ./usr/share/doc/libapparmor1/copyright \
    ./usr/share/lintian/overrides/libapparmor1\
"
