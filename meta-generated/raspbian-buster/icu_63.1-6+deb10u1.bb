PACKAGES = "${PN} icu-devtools libicu-dev libicu63"
PROVIDES = "icu-devtools libicu-dev libicu63"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/i/icu/icu-devtools_63.1-6+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/i/icu/libicu-dev_63.1-6+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/i/icu/libicu63_63.1-6+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_icu-devtools = "icu-devtools_63.1-6+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "e58780c417c6c571bf5ed6507369a0a27753de8a0431c8cf6113c136e242ca55"
SRC_URI[deb0.md5sum] = "9c209396376e939bf03af732a5915bd9"
DEBFILENAME_libicu-dev = "libicu-dev_63.1-6+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "ed2e8ee5e86b5b24ba9d482c9250b5f2307216377591384501dd37d0bcff6803"
SRC_URI[deb1.md5sum] = "bdfef40fba2fb83ee3a2e8df22072799"
DEBFILENAME_libicu63 = "libicu63_63.1-6+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "6cec406f924b93a64ae4a9926ee3b51690e757d607bbf5990260921ab2660a0c"
SRC_URI[deb2.md5sum] = "9d40e37354c42801f34f46d5bbef0908"

RDEPENDS_${PN}-devtools = "libc6 (>= 2.4) libgcc1 (>= 1:3.5) libicu63 (>= 63.1-1~) libstdc++6 (>= 5.2)"
RDEPENDS_lib${PN}-dev = "icu-devtools (>= 63.1-6+deb10u1) libc6-dev libicu63 (= 63.1-6+deb10u1)"
RDEPENDS_lib${PN}63 = "libc6 (>= 2.7) libgcc1 (>= 1:3.5) libstdc++6 (>= 5.2)"
DEPENDS = "libc6 libc6-dev libgcc1 libstdc++6"


inherit deb_group

FILES_icu-devtools = " \
    ./usr/bin/derb \
    ./usr/bin/genbrk \
    ./usr/bin/gencfu \
    ./usr/bin/gencnval \
    ./usr/bin/gendict \
    ./usr/bin/genrb \
    ./usr/bin/icuinfo \
    ./usr/bin/makeconv \
    ./usr/bin/pkgdata \
    ./usr/bin/uconv \
    ./usr/sbin/escapesrc \
    ./usr/sbin/genccode \
    ./usr/sbin/gencmn \
    ./usr/sbin/gennorm2 \
    ./usr/sbin/gensprep \
    ./usr/sbin/icupkg \
    ./usr/share/doc/icu-devtools/changelog.Debian.gz \
    ./usr/share/doc/icu-devtools/copyright \
    ./usr/share/man/man1/derb.1.gz \
    ./usr/share/man/man1/genbrk.1.gz \
    ./usr/share/man/man1/gencfu.1.gz \
    ./usr/share/man/man1/gencnval.1.gz \
    ./usr/share/man/man1/gendict.1.gz \
    ./usr/share/man/man1/genrb.1.gz \
    ./usr/share/man/man1/icuinfo.1.gz \
    ./usr/share/man/man1/makeconv.1.gz \
    ./usr/share/man/man1/pkgdata.1.gz \
    ./usr/share/man/man1/uconv.1.gz \
    ./usr/share/man/man8/genccode.8.gz \
    ./usr/share/man/man8/gencmn.8.gz \
    ./usr/share/man/man8/gennorm2.8.gz \
    ./usr/share/man/man8/gensprep.8.gz \
    ./usr/share/man/man8/icupkg.8.gz\
"
FILES_libicu-dev = " \
    ./usr/include/unicode/alphaindex.h \
    ./usr/include/unicode/appendable.h \
    ./usr/include/unicode/basictz.h \
    ./usr/include/unicode/brkiter.h \
    ./usr/include/unicode/bytestream.h \
    ./usr/include/unicode/bytestrie.h \
    ./usr/include/unicode/bytestriebuilder.h \
    ./usr/include/unicode/calendar.h \
    ./usr/include/unicode/caniter.h \
    ./usr/include/unicode/casemap.h \
    ./usr/include/unicode/char16ptr.h \
    ./usr/include/unicode/chariter.h \
    ./usr/include/unicode/choicfmt.h \
    ./usr/include/unicode/coleitr.h \
    ./usr/include/unicode/coll.h \
    ./usr/include/unicode/compactdecimalformat.h \
    ./usr/include/unicode/curramt.h \
    ./usr/include/unicode/currpinf.h \
    ./usr/include/unicode/currunit.h \
    ./usr/include/unicode/datefmt.h \
    ./usr/include/unicode/dbbi.h \
    ./usr/include/unicode/dcfmtsym.h \
    ./usr/include/unicode/decimfmt.h \
    ./usr/include/unicode/docmain.h \
    ./usr/include/unicode/dtfmtsym.h \
    ./usr/include/unicode/dtintrv.h \
    ./usr/include/unicode/dtitvfmt.h \
    ./usr/include/unicode/dtitvinf.h \
    ./usr/include/unicode/dtptngen.h \
    ./usr/include/unicode/dtrule.h \
    ./usr/include/unicode/edits.h \
    ./usr/include/unicode/enumset.h \
    ./usr/include/unicode/errorcode.h \
    ./usr/include/unicode/fieldpos.h \
    ./usr/include/unicode/filteredbrk.h \
    ./usr/include/unicode/fmtable.h \
    ./usr/include/unicode/format.h \
    ./usr/include/unicode/fpositer.h \
    ./usr/include/unicode/gender.h \
    ./usr/include/unicode/gregocal.h \
    ./usr/include/unicode/icudataver.h \
    ./usr/include/unicode/icuplug.h \
    ./usr/include/unicode/idna.h \
    ./usr/include/unicode/listformatter.h \
    ./usr/include/unicode/localpointer.h \
    ./usr/include/unicode/locdspnm.h \
    ./usr/include/unicode/locid.h \
    ./usr/include/unicode/measfmt.h \
    ./usr/include/unicode/measunit.h \
    ./usr/include/unicode/measure.h \
    ./usr/include/unicode/messagepattern.h \
    ./usr/include/unicode/msgfmt.h \
    ./usr/include/unicode/normalizer2.h \
    ./usr/include/unicode/normlzr.h \
    ./usr/include/unicode/nounit.h \
    ./usr/include/unicode/numberformatter.h \
    ./usr/include/unicode/numberrangeformatter.h \
    ./usr/include/unicode/numfmt.h \
    ./usr/include/unicode/numsys.h \
    ./usr/include/unicode/parseerr.h \
    ./usr/include/unicode/parsepos.h \
    ./usr/include/unicode/platform.h \
    ./usr/include/unicode/plurfmt.h \
    ./usr/include/unicode/plurrule.h \
    ./usr/include/unicode/ptypes.h \
    ./usr/include/unicode/putil.h \
    ./usr/include/unicode/rbbi.h \
    ./usr/include/unicode/rbnf.h \
    ./usr/include/unicode/rbtz.h \
    ./usr/include/unicode/regex.h \
    ./usr/include/unicode/region.h \
    ./usr/include/unicode/reldatefmt.h \
    ./usr/include/unicode/rep.h \
    ./usr/include/unicode/resbund.h \
    ./usr/include/unicode/schriter.h \
    ./usr/include/unicode/scientificnumberformatter.h \
    ./usr/include/unicode/search.h \
    ./usr/include/unicode/selfmt.h \
    ./usr/include/unicode/simpleformatter.h \
    ./usr/include/unicode/simpletz.h \
    ./usr/include/unicode/smpdtfmt.h \
    ./usr/include/unicode/sortkey.h \
    ./usr/include/unicode/std_string.h \
    ./usr/include/unicode/strenum.h \
    ./usr/include/unicode/stringoptions.h \
    ./usr/include/unicode/stringpiece.h \
    ./usr/include/unicode/stringtriebuilder.h \
    ./usr/include/unicode/stsearch.h \
    ./usr/include/unicode/symtable.h \
    ./usr/include/unicode/tblcoll.h \
    ./usr/include/unicode/timezone.h \
    ./usr/include/unicode/tmunit.h \
    ./usr/include/unicode/tmutamt.h \
    ./usr/include/unicode/tmutfmt.h \
    ./usr/include/unicode/translit.h \
    ./usr/include/unicode/tzfmt.h \
    ./usr/include/unicode/tznames.h \
    ./usr/include/unicode/tzrule.h \
    ./usr/include/unicode/tztrans.h \
    ./usr/include/unicode/ubidi.h \
    ./usr/include/unicode/ubiditransform.h \
    ./usr/include/unicode/ubrk.h \
    ./usr/include/unicode/ucal.h \
    ./usr/include/unicode/ucasemap.h \
    ./usr/include/unicode/ucat.h \
    ./usr/include/unicode/uchar.h \
    ./usr/include/unicode/ucharstrie.h \
    ./usr/include/unicode/ucharstriebuilder.h \
    ./usr/include/unicode/uchriter.h \
    ./usr/include/unicode/uclean.h \
    ./usr/include/unicode/ucnv.h \
    ./usr/include/unicode/ucnv_cb.h \
    ./usr/include/unicode/ucnv_err.h \
    ./usr/include/unicode/ucnvsel.h \
    ./usr/include/unicode/ucol.h \
    ./usr/include/unicode/ucoleitr.h \
    ./usr/include/unicode/uconfig.h \
    ./usr/include/unicode/ucpmap.h \
    ./usr/include/unicode/ucptrie.h \
    ./usr/include/unicode/ucsdet.h \
    ./usr/include/unicode/ucurr.h \
    ./usr/include/unicode/udat.h \
    ./usr/include/unicode/udata.h \
    ./usr/include/unicode/udateintervalformat.h \
    ./usr/include/unicode/udatpg.h \
    ./usr/include/unicode/udisplaycontext.h \
    ./usr/include/unicode/uenum.h \
    ./usr/include/unicode/ufieldpositer.h \
    ./usr/include/unicode/uformattable.h \
    ./usr/include/unicode/ugender.h \
    ./usr/include/unicode/uidna.h \
    ./usr/include/unicode/uiter.h \
    ./usr/include/unicode/uldnames.h \
    ./usr/include/unicode/ulistformatter.h \
    ./usr/include/unicode/uloc.h \
    ./usr/include/unicode/ulocdata.h \
    ./usr/include/unicode/umachine.h \
    ./usr/include/unicode/umisc.h \
    ./usr/include/unicode/umsg.h \
    ./usr/include/unicode/umutablecptrie.h \
    ./usr/include/unicode/unifilt.h \
    ./usr/include/unicode/unifunct.h \
    ./usr/include/unicode/unimatch.h \
    ./usr/include/unicode/unirepl.h \
    ./usr/include/unicode/uniset.h \
    ./usr/include/unicode/unistr.h \
    ./usr/include/unicode/unorm.h \
    ./usr/include/unicode/unorm2.h \
    ./usr/include/unicode/unum.h \
    ./usr/include/unicode/unumberformatter.h \
    ./usr/include/unicode/unumsys.h \
    ./usr/include/unicode/uobject.h \
    ./usr/include/unicode/upluralrules.h \
    ./usr/include/unicode/uregex.h \
    ./usr/include/unicode/uregion.h \
    ./usr/include/unicode/ureldatefmt.h \
    ./usr/include/unicode/urename.h \
    ./usr/include/unicode/urep.h \
    ./usr/include/unicode/ures.h \
    ./usr/include/unicode/uscript.h \
    ./usr/include/unicode/usearch.h \
    ./usr/include/unicode/uset.h \
    ./usr/include/unicode/usetiter.h \
    ./usr/include/unicode/ushape.h \
    ./usr/include/unicode/uspoof.h \
    ./usr/include/unicode/usprep.h \
    ./usr/include/unicode/ustdio.h \
    ./usr/include/unicode/ustream.h \
    ./usr/include/unicode/ustring.h \
    ./usr/include/unicode/ustringtrie.h \
    ./usr/include/unicode/utext.h \
    ./usr/include/unicode/utf.h \
    ./usr/include/unicode/utf16.h \
    ./usr/include/unicode/utf32.h \
    ./usr/include/unicode/utf8.h \
    ./usr/include/unicode/utf_old.h \
    ./usr/include/unicode/utmscale.h \
    ./usr/include/unicode/utrace.h \
    ./usr/include/unicode/utrans.h \
    ./usr/include/unicode/utypes.h \
    ./usr/include/unicode/uvernum.h \
    ./usr/include/unicode/uversion.h \
    ./usr/include/unicode/vtzone.h \
    ./usr/lib/arm-linux-gnueabihf/icu/63.1/Makefile.inc \
    ./usr/lib/arm-linux-gnueabihf/icu/63.1/pkgdata.inc \
    ./usr/lib/arm-linux-gnueabihf/icu/Makefile.inc \
    ./usr/lib/arm-linux-gnueabihf/icu/current \
    ./usr/lib/arm-linux-gnueabihf/icu/pkgdata.inc \
    ./usr/lib/arm-linux-gnueabihf/libicudata.a \
    ./usr/lib/arm-linux-gnueabihf/libicudata.so \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.a \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.so \
    ./usr/lib/arm-linux-gnueabihf/libicuio.a \
    ./usr/lib/arm-linux-gnueabihf/libicuio.so \
    ./usr/lib/arm-linux-gnueabihf/libicutest.a \
    ./usr/lib/arm-linux-gnueabihf/libicutest.so \
    ./usr/lib/arm-linux-gnueabihf/libicutu.a \
    ./usr/lib/arm-linux-gnueabihf/libicutu.so \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.a \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-i18n.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-io.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/icu-uc.pc \
    ./usr/share/doc/libicu-dev/changelog.Debian.gz \
    ./usr/share/doc/libicu-dev/copyright \
    ./usr/share/icu/63.1/config/mh-linux \
    ./usr/share/icu/63.1/install-sh \
    ./usr/share/icu/63.1/mkinstalldirs\
"
FILES_libicu63 = " \
    ./usr/lib/arm-linux-gnueabihf/libicudata.so.63 \
    ./usr/lib/arm-linux-gnueabihf/libicudata.so.63.1 \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.so.63 \
    ./usr/lib/arm-linux-gnueabihf/libicui18n.so.63.1 \
    ./usr/lib/arm-linux-gnueabihf/libicuio.so.63 \
    ./usr/lib/arm-linux-gnueabihf/libicuio.so.63.1 \
    ./usr/lib/arm-linux-gnueabihf/libicutest.so.63 \
    ./usr/lib/arm-linux-gnueabihf/libicutest.so.63.1 \
    ./usr/lib/arm-linux-gnueabihf/libicutu.so.63 \
    ./usr/lib/arm-linux-gnueabihf/libicutu.so.63.1 \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.so.63 \
    ./usr/lib/arm-linux-gnueabihf/libicuuc.so.63.1 \
    ./usr/share/doc/libicu63/changelog.Debian.gz \
    ./usr/share/doc/libicu63/copyright \
    ./usr/share/lintian/overrides/libicu63\
"
