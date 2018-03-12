PACKAGES = "${PN} fontconfig fontconfig-config libfontconfig1"
PROVIDES = "fontconfig fontconfig-config libfontconfig1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/f/fontconfig/fontconfig_2.11.0-6.3+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/f/fontconfig/fontconfig-config_2.11.0-6.3+deb8u1_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/f/fontconfig/libfontconfig1_2.11.0-6.3+deb8u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_fontconfig = "fontconfig_2.11.0-6.3+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "647e9fd9d71f39bc1adc5559b5040f789f7d20bf830dd70877f58918f044cac3"
SRC_URI[deb0.md5sum] = "4057a46309f73426086609940be438f5"
DEBFILENAME_fontconfig-config = "fontconfig-config_2.11.0-6.3+deb8u1_all.deb"
SRC_URI[deb1.sha256sum] = "f7963c0338fd031101f3f684a4e37306eefcd05094220947dd9cb7388a2fe85f"
SRC_URI[deb1.md5sum] = "ec38a9f319d9110d827560f11b14b244"
DEBFILENAME_libfontconfig1 = "libfontconfig1_2.11.0-6.3+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "c3b44d6e482e751c05f36b4a94f89a18f8f557a66ac39fd1bccf0daf74a08246"
SRC_URI[deb2.md5sum] = "0c35910266e9ceea2ffcfd9a53edf7fd"

RDEPENDS_${PN} = "libc6 (>= 2.4) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.2.1) fontconfig-config"
RDEPENDS_${PN}-config = "debconf (>= 0.5) ucf (>= 0.29) fonts-dejavu-core"
RDEPENDS_lib${PN}1 = "libc6 (>= 2.7) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) fontconfig-config (>= 2.11.0-6.3+deb8u1)"
DEPENDS = "libexpat1 fonts-dejavu-core debconf libc6 libfreetype6 ucf"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/doc/fontconfig/fontconfig-user.txt.gz \
    ./usr/share/doc/fontconfig/fontconfig-user.pdf.gz \
    ./usr/bin/fc-scan \
    ./usr/share/man/man1/fc-pattern.1.gz \
    ./usr/bin/fc-list \
    ./usr/share/doc/fontconfig/fontconfig-user.html \
    ./usr/bin/fc-validate \
    ./usr/share/man/man1/fc-scan.1.gz \
    ./usr/bin/fc-match \
    ./usr/bin/fc-cache \
    ./usr/share/doc/fontconfig/README.gz \
    ./usr/share/doc/fontconfig/README.Debian \
    ./usr/bin/fc-cat \
    ./usr/share/doc/fontconfig/changelog.Debian.gz \
    ./usr/bin/fc-pattern \
    ./usr/share/lintian/overrides/fontconfig \
    ./usr/share/man/man1/fc-cat.1.gz \
    ./usr/share/man/man1/fc-validate.1.gz \
    ./usr/share/doc-base/fontconfig-user \
    ./usr/share/doc/fontconfig/copyright \
    ./usr/share/man/man1/fc-query.1.gz \
    ./usr/bin/fc-query \
    ./usr/share/doc/fontconfig/AUTHORS \
    ./usr/share/man/man1/fc-list.1.gz \
    ./usr/share/man/man1/fc-match.1.gz \
    ./usr/share/man/man1/fc-cache.1.gz \
    ./usr/share/doc/fontconfig/changelog.gz\
"
FILES_fontconfig-config = " \
    ./etc/fonts/conf.d/60-latin.conf \
    ./usr/share/man/man5/fonts-conf.5.gz \
    ./usr/share/fontconfig/conf.avail/49-sansserif.conf \
    ./usr/share/fontconfig/conf.avail/70-force-bitmaps.conf \
    ./etc/fonts/conf.d/49-sansserif.conf \
    ./usr/share/fontconfig/conf.avail/10-autohint.conf \
    ./usr/share/fontconfig/conf.avail/40-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/80-delicious.conf \
    ./etc/fonts/conf.d/README \
    ./usr/share/fontconfig/conf.avail/70-no-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/25-unhint-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/10-scale-bitmap-fonts.conf \
    ./etc/fonts/conf.d/51-local.conf \
    ./usr/share/fontconfig/conf.avail/65-fonts-persian.conf \
    ./usr/share/fontconfig/conf.avail/30-urw-aliases.conf \
    ./etc/fonts/conf.d/65-nonlatin.conf \
    ./etc/fonts/conf.d/30-metric-aliases.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-vbgr.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-light.conf \
    ./usr/share/fontconfig/conf.avail/69-unifont.conf \
    ./etc/fonts/conf.d/65-fonts-persian.conf \
    ./etc/fonts/conf.d/80-delicious.conf \
    ./usr/share/doc/fontconfig-config/README.gz \
    ./etc/fonts/conf.d/40-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/90-synthetic.conf \
    ./usr/share/fontconfig/conf.avail/45-latin.conf \
    ./usr/share/fontconfig/conf.avail/51-local.conf \
    ./etc/fonts/conf.d/10-scale-bitmap-fonts.conf \
    ./usr/share/xml/fontconfig/fonts.dtd \
    ./usr/share/fontconfig/conf.avail/10-unhinted.conf \
    ./usr/share/fontconfig/conf.avail/50-user.conf \
    ./etc/fonts/conf.d/50-user.conf \
    ./etc/fonts/fonts.conf \
    ./usr/share/fontconfig/conf.avail/60-latin.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-legacy.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-vrgb.conf \
    ./etc/fonts/conf.d/45-latin.conf \
    ./usr/share/doc/fontconfig-config/changelog.gz \
    ./etc/fonts/conf.d/90-synthetic.conf \
    ./etc/fonts/conf.d/11-lcdfilter-default.conf \
    ./usr/share/doc/fontconfig-config/copyright \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-bgr.conf \
    ./etc/fonts/conf.d/30-urw-aliases.conf \
    ./usr/share/fontconfig/conf.avail/70-yes-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/10-no-sub-pixel.conf \
    ./usr/share/doc/fontconfig-config/AUTHORS \
    ./etc/fonts/conf.d/20-unhint-small-vera.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-default.conf \
    ./usr/share/fontconfig/conf.avail/20-unhint-small-vera.conf \
    ./usr/share/fontconfig/conf.avail/65-khmer.conf \
    ./usr/share/fontconfig/conf.avail/65-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-rgb.conf \
    ./etc/fonts/conf.d/69-unifont.conf \
    ./usr/share/doc/fontconfig-config/changelog.Debian.gz \
    ./usr/share/fontconfig/conf.avail/30-metric-aliases.conf\
"
FILES_libfontconfig1 = " \
    ./usr/share/doc/libfontconfig1/changelog.gz \
    ./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1.8.0 \
    ./usr/share/doc/libfontconfig1/changelog.Debian.gz \
    ./usr/share/doc/libfontconfig1/copyright \
    ./usr/share/doc/libfontconfig1/README.gz \
    ./usr/share/doc/libfontconfig1/AUTHORS \
    ./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
