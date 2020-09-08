PACKAGES = "${PN} libmpdec2"
PROVIDES = "libmpdec2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/m/mpdecimal/libmpdec2_2.4.2-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmpdec2 = "libmpdec2_2.4.2-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "ec441279854d5bacc0e5eec5601040bbd20e10999ac0ac13d768c5db3885cd59"
SRC_URI[deb0.md5sum] = "3140cef1300345f20782b8334f345677"

RDEPENDS_libmpdec2 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libmpdec2 = " \
    ./usr/lib/arm-linux-gnueabihf/libmpdec.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libmpdec.so.2.4.2 \
    ./usr/share/doc/libmpdec2/changelog.Debian.gz \
    ./usr/share/doc/libmpdec2/changelog.gz \
    ./usr/share/doc/libmpdec2/copyright\
"
