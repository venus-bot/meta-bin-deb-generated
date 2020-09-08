PACKAGES = "${PN} libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
PROVIDES = "libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-program-options-dev_1.55.0.2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-regex-dev_1.55.0.2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-system-dev_1.55.0.2_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-thread-dev_1.55.0.2_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libboost-program-options-dev = "libboost-program-options-dev_1.55.0.2_armhf.deb"
SRC_URI[deb0.sha256sum] = "fb7c8be1e27ab4e882a522f1a8ff0b67671b0ac595bc1a280aa7a16f7eed38b2"
SRC_URI[deb0.md5sum] = "3ca13f4e9e88240928bf8ee73c51b0de"
DEBFILENAME_libboost-regex-dev = "libboost-regex-dev_1.55.0.2_armhf.deb"
SRC_URI[deb1.sha256sum] = "39fd414e428d58baac4da7344589753a51353adc260f06f3e4283c007aea5828"
SRC_URI[deb1.md5sum] = "bc19e3f959e4cb436361d9b381aab5b4"
DEBFILENAME_libboost-system-dev = "libboost-system-dev_1.55.0.2_armhf.deb"
SRC_URI[deb2.sha256sum] = "7ad021c38a5ffea47ffbaa6adc8be983d498b1d7094798e9154a1fdac99d9bc5"
SRC_URI[deb2.md5sum] = "c9b08539f1f1e03e3bd268eb9199fecd"
DEBFILENAME_libboost-thread-dev = "libboost-thread-dev_1.55.0.2_armhf.deb"
SRC_URI[deb3.sha256sum] = "b0918788d19210750b3cdde9e22003df9919fde62de853c13f0709b620f39c14"
SRC_URI[deb3.md5sum] = "e93edb7055d104b05ba53e5c782019fe"

RDEPENDS_lib${PN}-program-options-dev = "libboost-program-options1.55-dev"
RDEPENDS_lib${PN}-regex-dev = "libboost-regex1.55-dev"
RDEPENDS_lib${PN}-system-dev = "libboost-system1.55-dev"
RDEPENDS_lib${PN}-thread-dev = "libboost-thread1.55-dev"
DEPENDS = "libboost-program-options1.55-dev libboost-regex1.55-dev libboost-system1.55-dev libboost-thread1.55-dev"


inherit deb_group

FILES_libboost-program-options-dev = " \
    ./usr/share/doc/libboost-program-options-dev/changelog.gz \
    ./usr/share/doc/libboost-program-options-dev/copyright\
"
FILES_libboost-regex-dev = " \
    ./usr/share/doc/libboost-regex-dev/changelog.gz \
    ./usr/share/doc/libboost-regex-dev/copyright\
"
FILES_libboost-system-dev = " \
    ./usr/share/doc/libboost-system-dev/changelog.gz \
    ./usr/share/doc/libboost-system-dev/copyright\
"
FILES_libboost-thread-dev = " \
    ./usr/share/doc/libboost-thread-dev/changelog.gz \
    ./usr/share/doc/libboost-thread-dev/copyright\
"
